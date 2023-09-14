interface Props {
  step: number;
}

const ProgressCircle = ({ step }: Props) => {
  return (
    <div className="relative mt-6">
      <div className="w-24 h-24 border-4 border-main border-opacity-25 rounded-[50%]"></div>
      <div
        className=" absolute top-0 left-0 w-24 h-24 border-4 border-transparent border-t-main border-opacity-100 rounded-[50%]"
        style={{ transform: "rotate(45deg)" }}
      ></div>
      <div
        className=" transition-all duration-500 absolute top-0 left-0 w-24 h-24 border-4 border-transparent border-t-main border-opacity-100 rounded-[50%]"
        style={{ transform: ` ${step === 1 ? "rotate(45deg)" : "rotate(135deg)"}` }}
      ></div>
      <div
        className=" transition-all duration-500 absolute top-0 left-0 w-24 h-24 border-4 border-transparent border-t-main border-opacity-100 rounded-[50%]"
        style={{ transform: ` ${step === 1 ? "rotate(45deg)" : step === 2 ? "rotate(135deg)" : "rotate(225deg)"}` }}
      ></div>
      <div
        className=" transition-all duration-500 absolute top-0 left-0 w-24 h-24 border-4 border-transparent border-t-main border-opacity-100 rounded-[50%]"
        style={{
          transform: ` ${
            step === 1
              ? "rotate(45deg)"
              : step === 2
              ? "rotate(135deg)"
              : step === 3
              ? "rotate(225deg)"
              : "rotate(315deg)"
          }`,
        }}
      ></div>

      <p className="absolute top-1/2 left-1/2 transform -translate-x-1/2 -translate-y-1/2 text-2xl">{step} / 4</p>
    </div>
  );
};

export default ProgressCircle;
