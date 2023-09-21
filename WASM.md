# WASM

## Main points

- WASM is a binary instruction format designed as a portable compilation target for many programming languages
- Created as compilation target, with only few low-level primitives and delegating everything to the programming language
- 20x faster than JS
- Binary - secure and small - format
- Can use multi-core capabilities of most modern devices, whereas JS is single-threaded by default
- Predictable speed, great optimization possibilities. JS performance depends on a huge amount of factors and is difficult to optimize per performance
- Born from the collaboration of all major browsers, currently supported by Firefox, Chrome, Edge and Safari
- Living standard that keeps evolving: [see RFCs](https://github.com/orgs/WebAssembly/repositories)
    - [Agenda of W3C Meetings](https://github.com/WebAssembly/meetings/tree/main)
    - [Proposals](https://github.com/WebAssembly/proposals)
        - [Garbage Collector Proposal](https://github.com/WebAssembly/gc)
        - [Multi-Memory for WASM](https://github.com/WebAssembly/multi-memory)
        - [Exception Handling for WASM](https://github.com/WebAssembly/exception-handling)
        - [Threads](https://github.com/webassembly/threads)
        - [WASM Js-Promise integration](https://github.com/WebAssembly/js-promise-integration)
- WASI is in progress and will allow integration with the operating system
- The generated files come in two formats `wat` (using [S-Expressions](https://en.wikipedia.org/wiki/S-expression)) and `wasm` a binary file that can be executed in the Web Assembly VM

## Possible Questions / What's next? 

- Relation between Kotlin/JS and Kotlin/WASM
- Run in Browser, in Nodejs environment, in standalone environment / runtime:
    - [Wasmtime](https://wasmtime.dev/)
    - [Wasmer](https://wasmer.io/)
    - [WasmEdge](https://wasmedge.org/)
- Even docker is working on container running wasm files directly: [Wasm Workloads](https://docs.docker.com/desktop/wasm/)
- And Kubernetes community is also trying to keep pace: 
    - [Krustlet](https://krustlet.dev/) | [Repo](https://github.com/krustlet/krustlet)
    - [WasmEdge](https://wasmedge.org/book/en/use_cases/kubernetes.html)
- WaSi : OS independent interface for system call
    - [KoWasm](https://github.com/kowasm/kowasm)


## Further reading

- [Web Assembly official page](https://webassembly.org/)
- [What is WASM (Rust WASM Docs)](https://rustwasm.github.io/docs/book/what-is-webassembly.html)

**Research papers**:

- Yixuan Zhang, Shangtong Cao, Haoyu Wang, Zhenpeng Chen, Xiapu Luo, Dongliang Mu, Yun Ma, Gang Huang, and Xuanzhe Liu. 2023.
[Characterizing and Detecting WebAssembly Runtime Bugs](https://arxiv.org/pdf/2301.12102.pdf). 1, 1 (January 2023), 25 pages. https://doi.org/10.1145/nnnnnnn.nnnnnnn
- Ben L. Titzer. 2022. [A Fast In-Place Interpreter for WebAssembly](https://dl.acm.org/doi/pdf/10.1145/3563311). Proc. ACM Program. Lang. 6, OOPSLA2,
Article 148 (October 2022), 27 pages. https://doi.org/10.1145/3563311
- Donald Pinckney, Arjun Guha, and Yuriy Brun. 2020. [Wasm/k: Delimited Continuations for WebAssembly](https://arxiv.org/pdf/2010.01723.pdf). In Proceedings of the 16th ACM SIGPLAN International Symposium on Dynamic Languages (DLS ’20), November 17, 2020, Virtual, USA. ACM, New York, NY, USA, 19 pages. https://doi.org/10.1145/3426422.3426978
- Andreas Haas, Andreas Rossberg, Derek L. Schuff, Ben L. Titzer, Michael Holman, Dan Gohman, Luke Wagner, Alon Zakai, and JF Bastien. 2017. [Bringing the web up to speed with WebAssembly](https://dl.acm.org/doi/pdf/10.1145/3140587.3062363). SIGPLAN Not. 52, 6 (June 2017), 185–200. https://doi.org/10.1145/3140587.3062363
- Musch, M., Wressnegger, C., Johns, M., Rieck, K. (2019). [New Kid on the Web: A Study on the Prevalence of WebAssembly in the Wild.](https://ernie.ips.cs.tu-bs.de/papers/2019_DIMVA_WASM.pdf) In: Perdisci, R., Maurice, C., Giacinto, G., Almgren, M. (eds) Detection of Intrusions and Malware, and Vulnerability Assessment. DIMVA 2019. Lecture Notes in Computer Science(), vol 11543. Springer, Cham. https://doi.org/10.1007/978-3-030-22038-9_2
### WASM & Kotlin
- [Kotlin Blog - WASM Announcement](https://blog.jetbrains.com/kotlin/2021/11/k2-compiler-kotlin-wasm-and-tooling-announcements-at-the-2021-kotlin-event/) - Nov. 2021
- [Kotlin WASM](https://kotlinlang.org/docs/wasm-overview.html)
- [Kotlin WASM by example](https://github.com/Kotlin/kotlin-wasm-examples)
- [Google Blog - Bringing kotlin to the Web](https://developers.googleblog.com/2023/05/bringing-kotlin-to-web.html)
- [Introducing Kotlin WASM by Zalim](https://seb.deleuze.fr/introducing-kotlin-wasm/) (*Zalim is the lead SW Engineer at Jetbrains responsible for the WASM Project*)
- [The huge potential of Kotlin WASM](https://seb.deleuze.fr/the-huge-potential-of-kotlin-wasm/)
- [Video] [Kotlin WASM - A first look](https://www.youtube.com/watch?v=-pqz9sKXatw)
- [Video] [Kotlin goes WASM](https://www.youtube.com/watch?v=oIbX7nrSTPQ)


## Examples and Demos

- [D3Wasm](https://github.com/gabrielcuvillier/d3wasm/tree/master/neo) - Doom3 as c++ game running in the browser


## Previous attempts

- [ASM.js](http://asmjs.org/)

### What JS is missing

- Important features for performance critical operations (e.g. 64bit integers operations)
- multi-threading
- shared memory