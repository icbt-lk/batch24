"use strict";

let temperatures = [3, -2, -6, -1, "error", 9, 13, 17, 15, 14, 9, 5];

const calcTempAmplitude = (temp) => {
  // ignoring strings(error)
  temperatures = temperatures.filter((e) => e !== "error");

  // Finding the max and min value using spread operator
  const max = Math.max(...temperatures);
  const min = Math.min(...temperatures);
  console.log(max, min);
  return max - min;
};

const amplitude = console.log(calcTempAmplitude(temperatures));
console.log(amplitude);
