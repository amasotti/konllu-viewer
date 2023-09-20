import {Box, Button} from "@chakra-ui/react";
import {useNavigate} from "react-router-dom";
import { useData } from "../providers/DataContext";
import {useEffect, useState} from "react";
import KonlluViewer from "../../public/KoNLLU-Viewer-wasm.mjs";

export function ResultPage() {
    const navigate = useNavigate();
    const { textData, setTextData } = useData();
    const [wholeText, setWholeText ] = useState<string>("");

    /**
     * serveSentenceText
     * serveSentenceRepresentation
     * serveSentenceMetadata
     */

    useEffect(() => {
        const text = KonlluViewer.serveText(textData)
        setWholeText(text);
    })

    const goHome = () => {
        setTextData("");
        navigate("/");
    }

    const getSentenceText = (sentence: number) => {
        return KonlluViewer.serveSentenceText(textData, sentence);
    }

    const getSentenceRepresentation = (sentence: number) => {
        return KonlluViewer.serveSentenceRepresentation(textData, sentence);
    }

    const getSentenceMetadata = (sentence: number) => {
        return KonlluViewer.serveSentenceMetadata(textData, sentence);
    }

    return (
        <>
            <Button colorScheme="red" onClick={goHome}>
                Back Home
            </Button>

            <h2>TEXT:</h2>
            <div>
                {wholeText.split("\n").map((line, index) => {return <p key={index}>{line}</p>})}
            </div>


            <div>
                <h3>TEXT SENTENCE 0</h3>
            <p>
                { getSentenceText(0) }
            </p>
            </div>


            <div>
                <h3>METADATA SENTENCE 0</h3>
                <p>
                { getSentenceMetadata(0) }
                </p>
            </div>

            <div>
                <h3>REPRESENTATION SENTENCE 0</h3>
                <div dangerouslySetInnerHTML={{ __html: getSentenceRepresentation(0) }} >
                </div>
            </div>

        </>
    );
}