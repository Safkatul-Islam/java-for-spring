class Task {
    int id;
    String title;
    boolean completed;

    Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    void markDone() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return id + ") " + title + " -> " + completed;
    }
}