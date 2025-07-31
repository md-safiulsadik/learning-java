public class Main {

    public static void main(String[] args) {
        MessagingService whatsApp = new MessagingService();

        String[] names = {"Sadik", "Amina", "Rafi", "Lina", "Tarek"};
        String[] messages = {
            "Hi, how are you?",
            "Don't forget the meeting tomorrow.",
            "Let's go out for lunch!",
            "I'm studying Java now.",
            "Call me when you're free."
        };

        for (int i = 0; i < names.length; i++) {
            Message message = new Message(names[i], messages[i]);
            whatsApp.add(message);
        }

        for (Message message : whatsApp.getMessages()) {
            System.out.println(message);
        }
    }
}
