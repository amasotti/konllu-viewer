import { Textarea } from "@chakra-ui/react";

export function PasteArea() {
    return (
        <Textarea size="lg" placeholder="Paste your CoNLL-U text here." w='800px' h='300px'/>
    );
}