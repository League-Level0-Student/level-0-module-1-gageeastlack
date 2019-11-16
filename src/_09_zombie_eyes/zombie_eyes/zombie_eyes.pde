
void setup() {
size(575, 750);
}
void draw() {
PImage face = loadImage("zombieEyes.png");
image(face, 0, 0);
ellipse(250, 200, 50, 50);
fill(#AA0000);
ellipse(375, 215, 50, 50);
fill(#AA0000);
}
