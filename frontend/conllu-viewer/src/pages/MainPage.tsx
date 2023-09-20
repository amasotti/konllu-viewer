import { VStack } from "@chakra-ui/react"
import {useState} from "react";
import { TeaserPicture } from "../components/TeaserPicture";
import { InputOptionsStack } from "../components/InputOptionsStack.tsx";
import {FileUploadComponent} from "../components/FileUpload.tsx";
import {PasteArea} from "../components/PasteArea.tsx";
import {ActionButtonStack} from "../components/ActionButtonStack.tsx";
// @ts-ignore
import myModule from "../../public/KoNLLU-Viewer-wasm.mjs";

export function MainPage() {
    const [inputMethod, setInputMethod] = useState('upload');
    const [svgHtml, setSvgHtml] = useState("");
    const [text, setText] = useState("");

    const handleTextChange = (newText: string) => {
        setText(newText);
    };

    const resetText = () => {
        setText("");
    }

    const handleGenerateSvg = () => {
        const generatedSvgHtml = myModule.generateSvg(text);
        setSvgHtml(generatedSvgHtml);
    };


    return (
        <>
            <VStack spacing={8} p={8} align='center'>

                <TeaserPicture/>

                <InputOptionsStack
                    chooseUpload={() => setInputMethod("upload")}
                    choosePaste={() => setInputMethod("text")}
                />

                {/* Choose input method */}
                {inputMethod === "upload"
                    ? <FileUploadComponent onFileUpload={(t:string) => {console.log("Text " + t)} }/>
                    : <PasteArea onTextChange={handleTextChange}/>
                }

                <ActionButtonStack
                    onSubmit={handleGenerateSvg}
                />

                <div dangerouslySetInnerHTML={{ __html: svgHtml }} />

            </VStack>
        </>
    );
}
