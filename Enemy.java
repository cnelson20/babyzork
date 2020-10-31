public class Enemy {
  private int maxHealth;
  private int health;
  private int level;
  private int attack;
  private String weaponType;
  private String species;
  private double evade;

  public Enemy(String species,int health,int level,boolean evade,String weaponType) {
    this.species = species;
    this.maxHealth = health;
    this.health = health;
    this.weaponType = weaponType;
    double speciesModifier;
    switch (species) {
      default:
        speciesModifier = 1;
        break;
      case "Goblin":
        speciesModifier = 1.1;
        break;
      case "Human":
        speciesModifier = 1;
        break;
    }
    this.attack = (int)(level * speciesModifier);
  }

  //for when the player attacks
  public int defend(double damage) {
    if (Math.random() > evade) {
    int finalDamage = Math.ceiling(damage);
    }
  }

  //enemy is attacking
  public int attack(int plrDefense, int plrEvade) {
    if (Math.random() > plrEvade) {
      return Math.ceiling(attack / (1 + plrDefense / 50)) - plrDefense;
    } else {
      //attack misses
      return 0;
    }
  }

  //just basic healing
  public boolean heal(int amount) {
    if (amount > 0) {
      health += amount;
      return true;
    }
    return false;
  }
}
