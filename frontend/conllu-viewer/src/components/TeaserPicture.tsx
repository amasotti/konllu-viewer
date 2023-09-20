import {Box, Image} from "@chakra-ui/react";

export function TeaserPicture() {
    return <Box borderWidth="1px" borderRadius="sm" boxSize="md" p={4}>
        <Image className="cover" src="cover.png" alt="Example SVG"/>
    </Box>;
}
