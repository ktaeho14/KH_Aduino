int speaker = 8;
int melody[] = {262,294,330,349,392,440,494,523};
void setup() {
  pinMode(speaker, OUTPUT);
}

void loop() {
  for(int i=0; i<8; i++){
    tone(speaker, melody[i], 250);
    delay(400);
    noTone(speaker);
  }
  delay(2000);
}
