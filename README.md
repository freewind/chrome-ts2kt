Chrome Kotlin Api converted by ts2kt
====================================

Modify names when copy this project
-----------------------------------

- `README.md`
- `build.gradle`
- `generated/package.json`

Modify version before publishing
--------------------------------

- `README.md`
- `build.gradle`
- `generated/package.json`

Publish
-------

```
./gradlew install
./gradlew bintrayUpload
```

```
./npm-link.sh
cd npm-publish; npm publish
```

Then use in other project:

```
repositories {
    maven { url 'https://dl.bintray.com/freewind/maven/' }
}

dependencies {
    compile "freewind.github.com:chrome-ts2kt:0.3.0"
}
```

also:

```
npm install --save chrome-ts2kt
```

Resources
---------

- Chrome doc: <https://developer.chrome.com/extensions>
- tabs: <https://developer.chrome.com/extensions/tabs.html>
- ts2kt: <https://github.com/Kotlin/ts2kt>
- typescript defs for chrome: <https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/chrome>

Convert TypeScript Definition to Kotlin
---------------------------------------

```
wget https://raw.githubusercontent.com/DefinitelyTyped/DefinitelyTyped/master/types/chrome/index.d.ts
npm install -g ts2kt
ts2kt index.d.ts
```

Then copy the files to `src/main/kotlin/chrome`