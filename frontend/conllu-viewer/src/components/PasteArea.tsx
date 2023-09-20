import { Textarea } from "@chakra-ui/react";
import {useState} from "react";

export function PasteArea({onTextChange}) {
    const [textAreaValue, setTextAreaValue] = useState("");

    const handleChange = (e: Event) => {
        const newValue = e.target!!.value;
        setTextAreaValue(newValue);
        onTextChange(newValue);  // Pass the new value to the parent component
    };
    return (
        <Textarea
            size="lg"
            placeholder="Paste your CoNLL-U text here."
            w='800px'
            h='300px'
            value={textAreaValue}
            onChange={handleChange}
        />
    );
}