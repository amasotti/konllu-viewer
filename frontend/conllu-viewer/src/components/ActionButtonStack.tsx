import {Button, HStack } from "@chakra-ui/react";

export function ActionButtonStack(props: { onSubmit: () => void}) {
    return (<HStack>
        <Button colorScheme="blue" onClick={props.onSubmit}>
            Submit
        </Button>
    </HStack>);
}