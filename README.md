# Angular 2 QuickStart Source in Java (JSweet-powered)

This repository is an adaptation of the [Angular 2 quickstart with TypeScript](https://github.com/angular/quickstart). The only difference is that the source code is written in Java, and compiled to TypeScript using [JSweet](https://github.com/cincheo/jsweet). So, this project is potentially a good starting point to start building an Angular 2 application with Java.

For details on how to use this project, please refer to the [original project](https://github.com/angular/quickstart), which provides extensive documentation, and to the [angular.io quickstart](https://angular.io/docs/ts/latest/quickstart.html).

## Prerequisites

Node.js > v4.x.x and npm > v3.x.x. 
    
**Verify that you are running at least node `v4.x.x` and npm `3.x.x`**
by running `node -v` and `npm -v` in a terminal/console window.
Older versions produce errors.

Maven (for compiling with JSweet).

## Getting started

Clone the project.

```bash
git clone  https://github.com/cincheo/jsweet-angular2-quickstart my-proj
cd my-proj
```

Compile JSweet sources (located in: ``src/main/java``).

```bash
mvn generate-sources
```

> Note: you can also use Eclipse to compile (see the JSweet Eclipse plugin).

Install the npm packages described in the `package.json` and verify that it works:

**Attention Windows Developers:  You must run all of these commands in administrator mode**.

```bash
npm install
npm start
```

This will open the application in your browser. If you compile again the Java source files, the application will automatically reload. Shut it down manually with Ctrl-C.

### How to extend the application

You can add new files in the ``app`` package (``src/main/java``). Please be aware that in JSweet, each package is a module. So, all the classes defined in a given package will belong to the same TypeScript/JavaScript module.

A minimal Angular 2 API is defined in the ``def.angular`` package (the ``def`` package in JSweet is by convention similar to a ``d.ts`` file in TypeScript: it holds external declarations). When extending the application, you will need to provide the API elements that you are using and that would be missing in the current definitions.

If you want to use external JavaSript libraries, check out JSweet candies rather than writing definitions manually. Here definitions have to be written manually for Angular 2 because the corresponding candy does not exist yet.

### Other topics

Please refer to the [original project](https://github.com/angular/quickstart).
