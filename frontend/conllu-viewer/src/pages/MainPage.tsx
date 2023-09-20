import { VStack } from "@chakra-ui/react"
import {useState} from "react";
import { TeaserPicture } from "../components/TeaserPicture";
import { InputOptionsStack } from "../components/InputOptionsStack.tsx";
import {FileUploadComponent} from "../components/FileUpload.tsx";
import {PasteArea} from "../components/PasteArea.tsx";
import {ActionButtonStack} from "../components/ActionButtonStack.tsx";
// @ts-ignore
import myModule from "../../public/KoNLLU-Viewer-wasm.mjs";
import {useData} from "../providers/DataContext.tsx";
import { useNavigate } from "react-router-dom";

export function MainPage() {
    const navigate = useNavigate();
    const [inputMethod, setInputMethod] = useState('upload');
    const { setTextData } = useData();

    const handleTextChange = (newText: string) => {
        setTextData(newText);
    };

    const handleUpload = (file: string) => {
        setTextData(file);
        navigate("/result")
    }

    const goToResultPage = () => {
        // const generatedSvgHtml = myModule.generateSvg(text);
        // setSvgHtml(generatedSvgHtml);
        navigate("/result");
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
                    ? <FileUploadComponent onFileUpload={handleUpload}/>
                    : <PasteArea onTextChange={handleTextChange}/>
                }

                {inputMethod === "text" ? <ActionButtonStack
                    onSubmit={goToResultPage}
                /> : null}

            </VStack>
        </>
    );
}
