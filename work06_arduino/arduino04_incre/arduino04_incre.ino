int pin = 6;


void setup() {
  pinMode(pin, OUTPUT);
}

void loop() {
  for(int i=0; i<2000; i+=100){
    digitalWrite(pin, HIGH);
    delay(i);
    digitalWrite(pin, LOW);
    delay(i);
  }
}
