Chrome Kotlin Api converted by ts2kt
====================================

```
./gradlew install
```

Then use in other project:

```
compile "freewind:chrome-ts2kt:1.0.0"
```

And for now, we also need to copy the generated js file to the target project. (Later I may provide npm package):

```
cp build/classes/kotlin/main/chrome-ts2kt.js target-project/
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