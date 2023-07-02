package Services;

import Domen.Product;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ProductInterface extends JFrame {
    private List<Product> products;
    private JList<Product> productList;
    private JTextField placeField;
    private JButton buyButton;

    public ProductInterface() {
        // Инициализация списка продуктов
        products = new ArrayList<>();

        // Настройка окна
        setTitle("Интерфейс продуктов");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Создание компонентов
        productList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(productList);
        placeField = new JTextField();
        buyButton = new JButton("Купить товар");

        // Добавление компонентов в окно
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Наличность:"));
        inputPanel.add(placeField);
        inputPanel.add(buyButton);
        add(inputPanel, BorderLayout.SOUTH);

        // Обработчик нажатия кнопки "Купить товар"
        buyButton.addActionListener(e -> buyProduct());

        setVisible(true);
    }

    private void buyProduct() {
        int selectedIndex = productList.getSelectedIndex();
        if (selectedIndex >= 0) {
            Product selectedProduct = products.get(selectedIndex);
            try {
                int place = Integer.parseInt(placeField.getText());
                selectedProduct.setPlace(place);
                JOptionPane.showMessageDialog(this, "Товар куплен:\n" + selectedProduct.toString());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ошибка: введите корректную наличность", "Ошибка", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите товар из списка", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void addProduct(Product product) {
        products.add(product);
        productList.setListData(products.toArray(new Product[0]));
    }
}