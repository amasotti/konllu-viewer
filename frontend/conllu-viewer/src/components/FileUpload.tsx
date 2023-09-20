import {Box, Text} from "@chakra-ui/react";

export function FileUploadComponent() {
    return (
        <Box borderWidth="1px" borderRadius="md" p={12} w="800px" h="300px">
            {/* File Upload Component Here */}
            <Text>Drag and drop your CoNLL-U file here.</Text>
        </Box>)
}