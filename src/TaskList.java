import java.util.ArrayList;

class TaskList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Tarefa adicionada.");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Lista de tarefas está vazia.");
        } else {
            System.out.println("Lista de tarefas:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void completeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.get(index - 1).markAsCompleted();
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    public void removeTask(int index) {
        if (index >= 1 && index <= tasks.size()) {
            tasks.remove(index - 1);
            System.out.println("Tarefa removida.");
        } else {
            System.out.println("Número de tarefa inválido.");
        }
    }

    public void clearTasks() {
        tasks.clear();
        System.out.println("Lista de tarefas limpa.");
    }
}