import { Routes, Route } from "react-router-dom";
import {ChakraProvider} from "@chakra-ui/react";
import {MainPage} from "./pages/MainPage.tsx";
import {Footer} from "./components/Footer";
import {Header} from "./components/Header.tsx";
import { ResultPage } from './pages/ResultPage.tsx';
import './App.css'
import {DataProvider} from "./providers/DataContext.tsx";

function App() {
  return (
    <>
        <ChakraProvider>
            <Header/>
                <DataProvider>
                    <Routes>
                        <Route path="/" element={<MainPage />}>
                            {/*<Route index element={<MainPage />} />*/}
                        </Route>
                        <Route path="result" element={<ResultPage />} />
                    </Routes>
                </DataProvider>
            <Footer/>

        </ChakraProvider>
    </>
  )
}

export default App
