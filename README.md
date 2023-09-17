# KoNLL-U Viewer

## Introduction

This is a simple web application for viewing KoNLL-U files.


## Repo Structure

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
├── shared/                   # Shared code or assets
├── scripts/                  # Build and deployment scripts
├── docs/                     # Documentation
│   └── README.md
├── .gitignore
├── README.md                 # Main README
└── LICENSE
```


## Troubleshooting

- If during compilation / while running the WASM project the browser complains about not having the experimental garbage collector
activated, then just follow the instructions [here](https://kotlinlang.org/docs/wasm-get-started.html#troubleshooting)


## Resources

### WASM

see [WASM.md](./WASM.md)


### CoNLL-U Format