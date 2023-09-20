import {
    Box,
    Text,
    Textarea,
    Button,
    VStack,
    HStack,
    useDisclosure,
    Collapse,
} from "@chakra-ui/react"
import {useState} from "react";
import { TeaserPicture } from "../components/TeaserPicture";
import { InputOptionsStack } from "../components/InputOptionsStack.tsx";
import {FileUploadComponent} from "../components/FileUpload.tsx";
import {PasteArea} from "../components/PasteArea.tsx";
import {ActionButtonStack} from "../components/ActionButtonStack.tsx";

export function MainPage() {
    const [inputMethod, setInputMethod] = useState('upload');



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
                    ? <FileUploadComponent/>
                    : <PasteArea/>
                }

                <ActionButtonStack
                    onSubmit={() => {console.log("Submitted")} }
                    onReset={() => {console.log("Resetted")} }
                />

            </VStack>
        </>
    );
}
