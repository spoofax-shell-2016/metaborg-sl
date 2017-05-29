function main() {
  i = 1;
  while(i <= 5) {
    i = foo(i);
  }
  println(i);
}

function foo(i) {
  if(i < 100) {
    i = foo(i + 1);
  }
  return i;
}