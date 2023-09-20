import { Routes, Route } from "react-router-dom";
import {ChakraProvider} from "@chakra-ui/react";
import {MainPage} from "./pages/MainPage.tsx";
import {Footer} from "./components/Footer";
import {Header} from "./components/Header.tsx";
import { ResultPage } from './pages/ResultPage.tsx';
import './App.css'

function App() {
  return (
    <>
        <ChakraProvider>
            <Header/>
            <Routes>
                <Route path="/" element={<MainPage />}>
                    <Route index element={<MainPage />} />
                    <Route path="about" element={<ResultPage />} />
                </Route>
            </Routes>

            <Footer/>

        </ChakraProvider>
    </>
  )
}

export default App
