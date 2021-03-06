package view.menu;

import view.menu.CLIMenu;

/**
 * This menu contains all characters. Player 1 chooses a character, and
 * it is passed to Character2Menu.
 * @author Joonas
 */
public class Character1Menu extends CLIMenu {
    public Character1Menu() {
        this.menuelements.add(new JukkaElement1());
        this.menuelements.add(new PekkaElement1());
        this.showMenu();
        activateMenuElement();
        
    }
    @Override
    public void activateMenuElement() {
         switch (input.nextInt()) {
            case 1:
                menuelements.get(0).action();
                break;
            case 2:
                menuelements.get(1).action();
                break;
            case 3:
                menu = new CLIMainMenu();
                break;
            default:
                break;
        }
    }
}
