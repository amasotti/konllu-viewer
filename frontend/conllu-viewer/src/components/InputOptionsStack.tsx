import {Button, HStack } from "@chakra-ui/react";

export function InputOptionsStack(props: { chooseUpload: () => void, choosePaste: () => void }) {
    return <HStack>
        <Button onClick={props.chooseUpload}>Upload File</Button>
        <Button onClick={props.choosePaste}>Text Input</Button>
    </HStack>;
}