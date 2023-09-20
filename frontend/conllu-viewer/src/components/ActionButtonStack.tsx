import {Button, HStack } from "@chakra-ui/react";

export function ActionButtonStack(props: { onSubmit: () => void, onReset: () => void }) {
    return (<HStack>
        <Button colorScheme="blue" onClick={props.onSubmit}>
            Submit
        </Button>
        <Button onClick={props.onReset}>
            Reset
        </Button>
    </HStack>);
}