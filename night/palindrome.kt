/*
* Your task is to implement a palindrome test.
*
* A string is called a palindrome when it reads the same way left-to-right
* and right-to-left.
*
* See http://en.wikipedia.org/wiki/Palindrome
*/
package palindrome

fun main(args: Array<String>) {
    println(isPalindrome("abba"));  //true
    println(isPalindrome("absba")); // true
    println(isPalindrome("abbc"));  // false
}

fun isPalindrome(s: String): Boolean {
  if(!s.isEmpty()) {
    for(i in 0..s.length/2) {
      if(s[i] != s[s.length - i - 1]) {
        return false;
      }
    }
  }
  return true;
}

fun isPalindrome1(s: String): Boolean {
  if (s.isEmpty()) return true;
  var acc = 0;

  for (c in s) {
    acc = acc.xor(c.toInt());
  }

  if(0 == acc && s[0] == s[s.length-1]) {
    return true
  } else if(s.length % 2 == 0) {
    return false
  } else {
    return acc == s[s.length/2].toInt()
  }
}

