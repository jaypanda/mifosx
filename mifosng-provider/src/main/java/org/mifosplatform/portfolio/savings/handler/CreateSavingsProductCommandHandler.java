package org.mifosplatform.portfolio.savings.handler;

import org.mifosplatform.commands.handler.NewCommandSourceHandler;
import org.mifosplatform.infrastructure.core.api.JsonCommand;
import org.mifosplatform.infrastructure.core.data.CommandProcessingResult;
import org.mifosplatform.portfolio.savings.service.SavingsProductWritePlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateSavingsProductCommandHandler implements NewCommandSourceHandler {

    private final SavingsProductWritePlatformService writePlatformService;

    @Autowired
    public CreateSavingsProductCommandHandler(final SavingsProductWritePlatformService writePlatformService) {
        this.writePlatformService = writePlatformService;
    }

    @Override
    public CommandProcessingResult processCommand(final JsonCommand command) {
        return this.writePlatformService.create(command);
    }
}