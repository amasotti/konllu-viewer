import { Box, Text } from '@chakra-ui/react';

export function Footer() {
  return (
    <Box as="footer" mt={12}>
      <hr />
      <Text fontSize=".8em">Created by Toni out of curiosity ❤️</Text>
      <Text fontSize=".8em">
        <a href="https://github.com/amasotti/konllu-viewer" target="_blank" rel="noopener noreferrer">
          Code available on GitHub
        </a>
      </Text>
    </Box>
  );
}
