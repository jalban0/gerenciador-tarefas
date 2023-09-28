import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Visualizar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Limpar lista de tarefas");
            System.out.println("6. Sair");
            System.out.print("\nInforme o numero da ação desejada:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar a quebra de linha

            switch (choice) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String description = scanner.nextLine();
                    taskList.addTask(new Task(description));
                    break;
                case 2:
                    taskList.viewTasks();
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa concluída: ");
                    int completedTaskIndex = scanner.nextInt();
                    taskList.completeTask(completedTaskIndex);
                    break;
                case 4:
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int removedTaskIndex = scanner.nextInt();
                    taskList.removeTask(removedTaskIndex);
                    break;
                case 5:
                    taskList.clearTasks();
                    break;
                case 6:
                    System.out.println("Saindo do aplicativo.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}




