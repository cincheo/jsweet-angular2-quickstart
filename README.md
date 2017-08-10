# Angular 2 QuickStart Source in Java (JSweet-powered)

This repository is an adaptation of the [Angular 2 quickstart with TypeScript](https://github.com/angular/quickstart). The core difference is that the source code is written in Java and transpiled using [JSweet](https://github.com/cincheo/jsweet). So, this project is potentially a good starting point to start building an Angular 2 application with Java. It should also be possible to adapt this project for Angular 4 (would require an Angular 4 candy) - contributions are more than welcome ;)

For details on how to use this project, please refer to the [original project](https://github.com/angular/quickstart), which provides extensive documentation, and to the [angular.io quickstart](https://angular.io/docs/ts/latest/quickstart.html).

## Prerequisites

Node.js > v4.x.x and npm > v3.x.x. 
    
**Verify that you are running at least node `v4.x.x` and npm `3.x.x`**
by running `node -v` and `npm -v` in a terminal/console window.
Older versions may produce errors.

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

You can add new files in the ``app`` package (``src/main/java``). For example sake, your may want to check the [JSweet PrimeNG Quickstart](https://github.com/cincheo/jsweet-primeng-quickstart), which provides a more complete Angular2 example based on the same project's structure. 

The project uses the [angular2 candy](https://github.com/jsweet-candies/candy-angular2), see the Maven dependencies in ``pom.xml``. This candy may require some improvements. In that case, you may want to clone that repository and contribute to it. You may also want to get rid of the dependency, copy the ``def.angular`` source code in your project's source code and perform in-place modifications.
