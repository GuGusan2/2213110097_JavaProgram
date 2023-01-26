import javax.swing.JOptionPane;

public class BookDemo2 {

	public static void main(String[] args) {
		int check, bPage;
		String name, email, bName;

		

		name = JOptionPane.showInputDialog("Input author name: ");
		email = JOptionPane.showInputDialog("Input author e-mail: ");
		bName = JOptionPane.showInputDialog("Input book title: ");
		bPage = Integer.parseInt(JOptionPane.showInputDialog("Input book page: "));
		check = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm", JOptionPane.YES_NO_OPTION);
		Book1 book = new Book1(bName,new Author1(name,email),bPage);
		while (check == 1) {
			bPage = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));
			check = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm", JOptionPane.YES_NO_OPTION);
			book.setPage(bPage);
		}
		JOptionPane.showMessageDialog(null,
				"Book Title : " + book.getTitle() + "\nAuthor name : " + book.getAuthor().getName() + " ("
						+ book.getPage() + " page)" + "\nAuthor e-mail : " + book.getAuthor().getEmail());

	}

}
