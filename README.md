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

- [Web Assembly official page](https://webassembly.org/)

**Research papers**:

- 

### WASM & Kotlin
- [Kotlin Blog - WASM Announcement](https://blog.jetbrains.com/kotlin/2021/11/k2-compiler-kotlin-wasm-and-tooling-announcements-at-the-2021-kotlin-event/) - Nov. 2021
- [Kotlin WASM](https://kotlinlang.org/docs/wasm-overview.html)
- [Kotlin WASM by example](https://github.com/Kotlin/kotlin-wasm-examples)
- [Google Blog - Bringing kotlin to the Web](https://developers.googleblog.com/2023/05/bringing-kotlin-to-web.html)
- [Introducing Kotlin WASM by Zalim](https://seb.deleuze.fr/introducing-kotlin-wasm/) (*Zalim is the lead SW Engineer at Jetbrains responsible for the WASM Project*)
- [The huge potential of Kotlin WASM](https://seb.deleuze.fr/the-huge-potential-of-kotlin-wasm/)
- [Video] [Kotlin WASM - A first look](https://www.youtube.com/watch?v=-pqz9sKXatw)

### CoNLL-U Format