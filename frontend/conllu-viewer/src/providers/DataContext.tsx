import React, { createContext, useState, useContext, ReactNode } from 'react';

interface DataContextProps {
  textData: string;
  setTextData: React.Dispatch<React.SetStateAction<string>>;
}

const DataContext = createContext<DataContextProps | undefined>(undefined);

export const useData = () => {
  const context = useContext(DataContext);
  if (!context) {
    throw new Error('useData must be used within a DataProvider');
  }
  return context;
};

interface DataProviderProps {
  children: ReactNode;
}

export const DataProvider: React.FC<DataProviderProps> = ({ children }) => {
  const [textData, setTextData] = useState<string>('');

  const value = {
    textData,
    setTextData
  };

  return <DataContext.Provider value={value}>{children}</DataContext.Provider>;
};
