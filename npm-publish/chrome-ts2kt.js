if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'chrome-ts2kt'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'chrome-ts2kt'.");
}
this['chrome-ts2kt'] = function (_, Kotlin) {
  'use strict';
  Kotlin.defineModule('chrome-ts2kt', _);
  return _;
}(typeof this['chrome-ts2kt'] === 'undefined' ? {} : this['chrome-ts2kt'], kotlin);
