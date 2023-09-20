import myModule from "./KoNLLU-Viewer-wasm.mjs"

document.getElementById("submitButton").addEventListener("click", function() {
    const text = document.getElementById("myTextArea").value;
    const htmlString = myModule.generateSvg(text);
    document.body.insertAdjacentHTML('beforeend', htmlString);
});

export {}
