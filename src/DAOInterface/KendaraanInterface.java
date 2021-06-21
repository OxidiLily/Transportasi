/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import Model.ModelKendaraan;
import java.util.List;

/**
 *
 * @author My MSI
 */
public interface KendaraanInterface {
    public void insert(ModelKendaraan tambah);
    public void update(ModelKendaraan ubah);
    public void delete(int hapus);
    
    public List<ModelKendaraan> getAll();
    public List<ModelKendaraan> getCari(Integer id_User);
}
