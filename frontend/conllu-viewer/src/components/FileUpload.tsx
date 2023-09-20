import {Box, Text} from "@chakra-ui/react";
import {useDropzone} from "react-dropzone";

export function FileUploadComponent({ onFileUpload }) {

    const { getRootProps, getInputProps } = useDropzone({
        accept: '.conllu',
        onDrop: (acceptedFiles) => {
            acceptedFiles.forEach((file) => {
                const reader = new FileReader();
                reader.onload = () => {
                    const content = reader.result;
                    onFileUpload(content);
                };
                reader.readAsText(file);
            });
        },
    });

    return (
        <Box className="dragDrop" borderWidth="1px" borderRadius="md" p={12} h="250px" {...getRootProps()}>
                <input {...getInputProps()} />
                <p>Drag 'n' drop a .conllu file here, or click to select one</p>
        </Box>)
}