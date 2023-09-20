
import './App.css'
import {ChakraProvider} from "@chakra-ui/react";
import {MainPage} from "./pages/MainPage.tsx";
import {Footer} from "./components/Footer";
import {Header} from "./components/Header.tsx";

function App() {
  return (
    <>
        <ChakraProvider>
            <Header/>
            <MainPage />
            {/*<label htmlFor="myTextArea">Your Conllu file</label>*/}
            {/*<textarea id="myTextArea"></textarea>*/}
            {/*<button id="submitButton">Submit</button>*/}
            <Footer/>
        </ChakraProvider>
    </>
  )
}

export default App
