FROM openjdk:21-jdk-slim
COPY out/artifacts/Budget_jar/Budget.jar budget.jar
RUN chmod +x /app/executer_gestionnaire_budget.sh
CMD ["/bin/bash", "/app/executer_gestionnaire_budget.sh"]