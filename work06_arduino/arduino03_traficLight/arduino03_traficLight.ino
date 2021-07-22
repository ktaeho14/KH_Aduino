int red =6;
int yellow = 8;
int green = 11;


void setup() {
  pinMode(red, OUTPUT);
  pinMode(yellow, OUTPUT);
  pinMode(green, OUTPUT);
}

void loop() {
 changeLights();

 delay(15000);

}

void changeLights(){
  //초록 OFF, 노란색 ON
  digitalWrite(green, LOW);
  digitalWrite(yellow, HIGH);
  delay(3000);

  //노란 OFF, 빨간 ON
  digitalWrite(yellow, LOW);
  digitalWrite(red, HIGH);
  delay(5000);

  //노란 on
  digitalWrite(yellow, HIGH);
  delay(2000);

  //노란 off, 빨간off, 초록색 ON
  digitalWrite(yellow, LOW);
  digitalWrite(red, LOW);
  digitalWrite(green, HIGH);
  delay(2000);
}
