function main() {
  println(loop1(1, 200));
}

function loop1(i, j) {
  if(i <= j){
    return loop2(1, i) + loop1(i + 1, j);
  } else {
    return 1;
  }
}

function loop2(j, k) {
  if(j <= k){
    return loop3(1, j) + loop2(j+1, k);
  } else {
    return 1;
  }
}

function loop3(k, l){
  if(k <= l) {
    return 1 + loop3(k+1, l);
  } else {
    return 1;
  }
}