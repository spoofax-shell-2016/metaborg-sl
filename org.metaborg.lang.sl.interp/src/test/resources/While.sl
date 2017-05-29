function main() {
  i = 1;
  count = 0;
  while(i <= 200) {
    j = 0;
    while(j <= i) {
      k = 0;
      while(k <= j) {
        k = k + 1;
        count = count + 1;
      }
      j = j + 1;
    }
    i = i + 1;
  }
  println(count);
}