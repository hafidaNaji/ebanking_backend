package net.naji.ebankingbackend.Web;

import net.naji.ebankingbackend.dtos.AccountHistoryDTO;
import net.naji.ebankingbackend.dtos.AccountOperationDTO;
import net.naji.ebankingbackend.dtos.BankAccountDTO;
import net.naji.ebankingbackend.Services.BankAccountService;
import net.naji.ebankingbackend.exception.BankAccountNotException;
import net.naji.ebankingbackend.exception.BankAccountNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankAccountRestAPI {
    private BankAccountService bankAccountService;

    public BankAccountRestAPI(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/accounts/{accountId}")
   public BankAccountDTO getBankAccount(@PathVariable String accountId) throws BankAccountNotFoundException, BankAccountNotException {
        return bankAccountService.getBankAccount(accountId);
    }
    @GetMapping("/accounts")
   public List<BankAccountDTO>listAccounts(){
        return bankAccountService.bankAccountList();
   }
   @GetMapping("/accounts/{accountId}/operations")
  public List<AccountOperationDTO>getHistory(@PathVariable String accountId){
        return bankAccountService.accountHistory(accountId);
  }
    @GetMapping("/accounts/{accountId}/pageOperations")
    public AccountHistoryDTO getAccountHistory(
            @PathVariable String accountId,
            @RequestParam(name = "page",defaultValue = "0") int page,
            @RequestParam(name = "size",defaultValue = "5") int size) throws BankAccountNotFoundException {
        return bankAccountService.getAccountHistory(accountId,page,size);
    }
}
