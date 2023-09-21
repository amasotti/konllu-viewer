# KoNLL-U Viewer

## Introduction

Konllu-Viewer is a proof-of-concept application that demonstrates the integration of a Kotlin backend 
compiled with WebAssembly (WASM) into a React frontend. 

It is born from curiosity and willing to experimentate with such an amazing technology as [WASM](https://webassembly.org/)

The application allows users to visualize linguistic texts annotated in the CoNLL-U format.



## Repo Structure

The project is divided into two main parts:

1. **Backend**: Written in Kotlin and compiled to WebAssembly. It handles the parsing and SVG generation for CoNLL-U files.
2. **Frontend**: A React application that provides the user interface. It uses Chakra UI for styling and React Router for navigation.


```
KoNLLU-Viewer/
├── backend/                  # Kotlin/WASM backend
│   ├── src/
│   ├── build.gradle.kts
│   └── README.md
├── frontend/                 # React frontend
│   ├── src/
│   ├── package.json
│   └── README.md
├── docs/                     # Documentation
│   └── README.md
├── .gitignore
├── README.md                 # Main README
└── LICENSE
```

## Installation

### Backend

see the [README](./backend/README.md) file in the backend

## Frontend

see the [README](./frontend/conllu-viewer/README.md) in the frontend folder

## Usage

1. Upload or paste a CoNLL-U file into the frontend application.
2. Visualize the linguistic annotations, sentence metadata, and SVG representations.


## Troubleshooting

- If during compilation / while running the WASM project the browser complains about not having the experimental garbage collector
activated, then just follow the instructions [here](https://kotlinlang.org/docs/wasm-get-started.html#troubleshooting)
- For the backend, some commands require an environment variable `CHROME_BIN` to be set with the name of a browser executable able to run wasm files

## Resources

### WASM

see [WASM.md](./WASM.md)


### CoNLL-U Format

- [CoNLL-U Format](https://universaldependencies.org/format.html)

## License

[MIT](./LICENSE)