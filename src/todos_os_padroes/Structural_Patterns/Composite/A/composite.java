package todos_os_padroes.Structural_Patterns.Composite.A;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * A classe composite vai implementar a interface componente. Este vai
 * implementar os métodos da interface e vai percorrer os seus filhos, que são
 * os Componentes. Os objetos tanto podem ser Leaf como Composite.
 *
 */
public class composite implements Component {

    List<Component> component = new ArrayList<>();

    @Override
    public void sayHello() {
        for (Component component1 : component) {
            component1.sayHello();
        }
    }

    @Override
    public void sayGoodbye() {
        for (Component componente1 : component) {
            componente1.sayGoodbye();
        }
    }

    public void add(Component componentes) {
        component.add(componentes);
    }

    public void remove(Component components) {
        component.remove(components);
    }

    public List<Component> getComponents() {
        return component;
    }

    public Component getComponent(int i) {
        return component.get(i);
    }
}
