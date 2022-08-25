/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function (ransomNote, magazine) {
  a = ransomNote.split("");
  b = magazine.split("");
  c = 0;

  for (let i = 0; i < a.length; i++) {
    if (b.includes(a[i])) {
      c++;
      b.splice(b.indexOf(a[i]), 1);
    }
  }

  return c === ransomNote.length;
};