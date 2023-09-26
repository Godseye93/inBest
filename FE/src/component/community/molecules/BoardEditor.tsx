import { useBoardEditor } from "./useBoardEditor";
import QuillEditor from "../atoms/QuillEditor";
import { useEffect } from "react";
import { useSearchParams } from "react-router-dom";
import { getBoardDetail } from "../../../api/board";

const BoardEditor = ({ title }: { title: string }) => {
  const { quillRef, htmlContent, setHtmlContent, onSubmit } = useBoardEditor(title);
  const [searchParams] = useSearchParams();
  const boardSeq = searchParams.get("boardSeq");
  console.log(boardSeq);
  useEffect(() => {
    if (boardSeq) {
      const getValue = async () => {
        try {
          const res = await getBoardDetail(boardSeq);
          const content = res.board.context;
          setHtmlContent(content);
          console.log(content);
        } catch (err) {
          console.log(err);
        }
      };
      getValue();
    }
  }, [boardSeq]);
  return (
    <>
      <QuillEditor quillRef={quillRef} htmlContent={htmlContent} setHtmlContent={setHtmlContent} />
      <div className="justify-end flex my-5">
        <button onClick={onSubmit}>작성하기</button>
      </div>
    </>
  );
};
export default BoardEditor;
