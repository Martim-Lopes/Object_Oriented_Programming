package aula4;

public class Main {
    public static void main(String[] args) {
        // 1. Criar a empresa
        Empresa empresa = new Empresa();

        // 2. Criar diferentes tipos de empregados
        // Empregado base: 800€
        Empregado emp1 = new Empregado("Ana Silva", 1);

        // Gerente que cumpriu objetivos: 800€ + 200€ = 1000€
        Gerente ger1 = new Gerente("Carlos Sousa", 2, true);

        // Gerente que não cumpriu objetivos: 800€
        Gerente ger2 = new Gerente("Beatriz Costa", 3, false);

        // Diretor: (800€ * 2) + (1% de 50.000€) = 1600€ + 500€ = 2100€
        Diretor dir1 = new Diretor("Diogo Ramos", 4, 50000.0);

        // 3. Contratar os funcionários
        empresa.contratar(emp1);
        empresa.contratar(ger1);
        empresa.contratar(ger2);
        empresa.contratar(dir1);

        // 4. Apresentar os salários individuais
        System.out.println("=== Folha de Pagamentos ===");
        System.out.printf("%s (ID: %d) - Salário: %.2f€%n", emp1.getNome(), emp1.getId(), emp1.salario());
        System.out.printf("%s (ID: %d) - Salário: %.2f€%n", ger1.getNome(), ger1.getId(), ger1.salario());
        System.out.printf("%s (ID: %d) - Salário: %.2f€%n", ger2.getNome(), ger2.getId(), ger2.salario());
        System.out.printf("%s (ID: %d) - Salário: %.2f€%n", dir1.getNome(), dir1.getId(), dir1.salario());

        // 5. Total de salários inicial (esperado: 800 + 1000 + 800 + 2100 = 4700€)
        System.out.println("---------------------------");
        System.out.printf("Total inicial da empresa: %.2f€%n", empresa.salarioTotal());

        // 6. Testar despedimento
        System.out.println("\n-> A despedir: " + emp1.getNome() + "...");
        empresa.despedir(emp1);

        // 7. Total após o despedimento (esperado: 4700 - 800 = 3900€)
        System.out.printf("Total após despedimento: %.2f€%n", empresa.salarioTotal());
    }
}