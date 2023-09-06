/**
 * @type {import('tailwindcss').Config}
 */
module.exports = {
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    extend: {
      fontFamily: {
        light: ["light"],
        regular: ["regular"],
        medium: ["medium"],
        semiBold: ["semibold"],
        bold: ["bold"],
        extraBold: ["extraBold"],
      },
      colors: {
        main: "#6CE061",
        mainDark: "#47B04F",
        mainMoreDark: "##00A347",
        mainLight: "#A0DF92",
        mainMoreLight: "#ADF777",
        bright: "#EDFDE8",
        lime: "#C1E061",
      },
    },
  },
  plugins: [],
};
