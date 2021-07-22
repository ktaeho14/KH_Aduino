int pin = 6;



void setup() {
  pinMode(pin, OUTPUT);
}

void loop() {
  for(int i=0; i<256; i++){
    analogWrite(pin, i);
    delay(10);
  }
  for(int i=255; i>=0; i++){
    analogWrite(pin, i);
    delay(10);
  }
}
