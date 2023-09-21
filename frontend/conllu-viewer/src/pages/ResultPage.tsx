import {
  Box,
  Button,
  Accordion,
  AccordionItem,
  AccordionButton,
  AccordionPanel,
  Card,
  CardBody,
  Text,
  CardHeader
} from '@chakra-ui/react';
import { useNavigate } from 'react-router-dom';
import { useData } from '../providers/DataContext';
import { useEffect, useState } from 'react';
// @ts-ignore
import KonlluViewer from '../../public/KoNLLU-Viewer-wasm.mjs';

export function ResultPage() {
  const navigate = useNavigate();
  const { textData, setTextData } = useData();
  const [wholeText, setWholeText] = useState<string>('');

  useEffect(() => {
    const text = KonlluViewer.serveText(textData);
    setWholeText(text);
  }, [textData]);

  const goHome = () => {
    setTextData('');
    navigate('/');
  };

  const getSentenceText = (sentence: number) => {
    return KonlluViewer.serveSentenceText(textData, sentence);
  };

  const getSentenceRepresentation = (sentence: number) => {
    return KonlluViewer.serveSentenceRepresentation(textData, sentence);
  };

  const getSentenceMetadata = (sentence: number) => {
    return KonlluViewer.serveSentenceMetadata(textData, sentence);
  };

  return (
    <>
      <Button colorScheme="red" onClick={goHome}>
        Back Home
      </Button>

      {/*MAIN TEXT*/}
      <Card margin="2em" overflow="hidden" variant="filled">
        <CardHeader>
          <Text fontSize="xl" fontWeight="bold">
            Whole Text
          </Text>
        </CardHeader>
        <CardBody>
          {wholeText.split('\n').map(line => {
            const iterKey = Math.random();
            return <Text key={"sent_" + iterKey}>{line}</Text>;
          })}
        </CardBody>
      </Card>

      <Accordion allowToggle>
        {Array.from({ length: wholeText.split('\n\n').length }, (_, index) => (
          <AccordionItem key={index}>
            <AccordionButton _expanded={{ bg: 'tomato', color: 'white' }}>
              <Box flex="1" textAlign="left">
                Sentence {index}
              </Box>
            </AccordionButton>
            <AccordionPanel>
              <Card>
                <CardHeader>
                  <Text fontSize="md" fontWeight="bold">
                    TEXT SENTENCE {index}
                  </Text>
                </CardHeader>
                <CardBody className="sentenceText">{getSentenceText(index)}</CardBody>
              </Card>

              <Card>
                <CardHeader>
                  <Text fontSize="md" fontWeight="bold">
                    METADATA SENTENCE {index}
                  </Text>
                </CardHeader>
                <CardBody className="sentenceText">{getSentenceMetadata(index)}</CardBody>
              </Card>

              <Card>
                <CardHeader>
                  <Text fontSize="md" fontWeight="bold">
                    REPRESENTATION SENTENCE {index}
                  </Text>
                </CardHeader>
                <CardBody
                  dangerouslySetInnerHTML={{ __html: getSentenceRepresentation(index) }}
                ></CardBody>
              </Card>
            </AccordionPanel>
          </AccordionItem>
        ))}
      </Accordion>
    </>
  );
}
